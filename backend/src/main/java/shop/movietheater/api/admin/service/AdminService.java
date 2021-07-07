package shop.movietheater.api.admin.service;
import org.springframework.stereotype.Service;
import shop.movietheater.api.admin.domain.AdminDto;

import java.util.ArrayList;

@Service
public interface AdminService{
    void saveID(AdminDto AVO);
    void deleteID(String ID);
    boolean loginID(String ID, String PW);
    ArrayList<AdminDto> viewAdminAccountList();
}