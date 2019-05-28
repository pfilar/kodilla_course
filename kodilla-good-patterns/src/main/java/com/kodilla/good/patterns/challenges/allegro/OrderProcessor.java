package com.kodilla.good.patterns.challenges.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDTO process(ProductOrderRequest productOrderRequest) {
        boolean isSold = productOrderService.sold(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity());
        if (isSold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());

        } else {
            System.out.println("Order has been rejected.");
        }

        return new OrderDTO(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity(),
                isSold);
    }
}
