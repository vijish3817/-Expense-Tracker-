package com.expensetracker.service;

import java.io.ByteArrayInputStream;
import java.time.LocalDate;

import com.expensetracker.entity.User;

public interface ReportService {
    ByteArrayInputStream generateMonthlyReport(User user, LocalDate startDate, LocalDate endDate);
}
