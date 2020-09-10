package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Client;
import com.hy.crm.pojo.Contract;

public class ContractExt extends Contract {
    Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
