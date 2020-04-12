package co.com.globantBank.dto;

import java.util.ArrayList;
import java.util.List;

public class BankDTO {

    private String nameBank;
    private String codeBank;
    private List<ClientDTO> listClientDTO;

    public BankDTO() {
        listClientDTO = new ArrayList<ClientDTO>();
    }

    public BankDTO(String nameBank, String codeBank, List<ClientDTO> listClientDTO) {
        this.nameBank = nameBank;
        this.codeBank = codeBank;
        this.listClientDTO = listClientDTO;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getCodeBank() {
        return codeBank;
    }

    public void setCodeBank(String codeBank) {
        this.codeBank = codeBank;
    }

    public List<ClientDTO> getListClientDTO() {
        return listClientDTO;
    }

    public void setListClientDTO(List<ClientDTO> listClientDTO) {
        this.listClientDTO = listClientDTO;
    }
}
