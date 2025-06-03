package com.example.BillingSoftware.controller;

import com.example.BillingSoftware.io.OrderResponse;
import com.example.BillingSoftware.io.PaymentRequest;
import com.example.BillingSoftware.io.PaymentVerificationRequest;
import com.example.BillingSoftware.io.RazorpayOrderResponse;
import com.example.BillingSoftware.service.OrderService;
import com.example.BillingSoftware.service.RazorpayService;
import com.razorpay.RazorpayException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}