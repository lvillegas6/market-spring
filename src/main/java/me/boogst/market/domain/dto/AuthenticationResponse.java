package me.boogst.market.domain.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AuthenticationResponse {
        private String jwt;
}
