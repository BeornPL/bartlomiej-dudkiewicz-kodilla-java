package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private OrderRepository orderRepository;
    private InStockChecker inStockChecker;

    public ProductOrderService(final OrderRepository orderRepository, final InStockChecker inStockChecker) {
        this.orderRepository = orderRepository;
        this.inStockChecker = inStockChecker;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        if (inStockChecker.isInStock()) {
            orderRepository.storeData();
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Error!");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
