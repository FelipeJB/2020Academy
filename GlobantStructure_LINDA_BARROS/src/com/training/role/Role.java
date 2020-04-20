package com.training.role;

import java.util.ArrayList;
import java.util.List;

public interface Role {

    public String getRolePurpose();
    public String getRoleResponsibility();
    public int getRoleCode();

    public void setRolePurpose(String rolePurpose);
    public void setRoleResponsibility(String roleResponsibility);
    public void setRoleCode(int roleCode);
}
