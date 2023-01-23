package com.example.services;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WalletRequest {

    private String userName;
    private int amount;
}
