package shop.vinoweknow.api.admin.service;
import org.springframework.stereotype.Service;
import shop.vinoweknow.api.admin.domain.AdminVO;

import java.util.ArrayList;

@Service
public interface AdminService{
    public void saveID(AdminVO AVO);
    public void deleteID(String ID);
    public boolean loginID(String ID, String PW);
    ArrayList<AdminVO> viewAdminAccountList();
}