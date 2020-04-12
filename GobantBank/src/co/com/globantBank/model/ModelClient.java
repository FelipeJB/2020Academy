package co.com.globantBank.model;

import co.com.globantBank.dto.ClientDTO;
import co.com.globantBank.util.Settings;

import java.util.List;

public class ModelClient {

    private int codeClient;
    public ModelClient() {
        codeClient = 1;
    }

    public ClientDTO createClient(List<ClientDTO> listClientDTO) throws Exception {

        String user= (String) Settings.getData("Please, insert the user of the client", "STRING");

        for (ClientDTO data:listClientDTO){
            if(user.equals(data.getUser())){
                throw new Exception("User already exists");
            }
        }
        String strCodeClient= String.valueOf(codeClient++);
        String password = (String) Settings.getData("Please, insert the password of the client", "STRING");
        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setCodeClient(strCodeClient);
        clientDTO.setUser(user);
        clientDTO.setPassword(password);

        return clientDTO;
    }

    public void printListClient(List<ClientDTO> listClientDTO) {
        for (ClientDTO data:listClientDTO){
            System.out.println(data.toString());
            }
    }
}
