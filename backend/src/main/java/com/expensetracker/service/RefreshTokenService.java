package com.expensetracker.service;

import java.util.Optional;

import com.expensetracker.entity.RefreshToken;

public interface RefreshTokenService {
    Optional<RefreshToken> findByToken(String token);
    RefreshToken createRefreshToken(Long userId);
    RefreshToken verifyExpiration(RefreshToken token);
    int deleteByUserId(Long userId);
}
