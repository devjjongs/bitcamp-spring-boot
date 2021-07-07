package shop.movietheater.api.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.movietheater.api.admin.service.AdminServiceImpl;

@RestController
@RequestMapping("/admins")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {
    private final AdminServiceImpl service;
}
