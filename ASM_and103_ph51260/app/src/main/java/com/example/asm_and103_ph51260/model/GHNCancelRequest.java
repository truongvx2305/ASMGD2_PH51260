package com.example.asm_and103_ph51260.model;

import java.util.ArrayList;

public class GHNCancelRequest {
    private ArrayList<String> order_code;

    public GHNCancelRequest(ArrayList<String> order_code) {
        this.order_code = order_code;
    }

    public GHNCancelRequest() {
    }

    public void setOrder_code(ArrayList<String> order_code) {
        this.order_code = order_code;
    }

    public ArrayList<String> getOrder_code() {
        return order_code;
    }
}
