package com.example.BillingSoftware.service;

import com.razorpay.RazorpayException;
import com.example.BillingSoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
