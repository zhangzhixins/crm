package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Client;

public class BusinessExt extends Business {
    Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
