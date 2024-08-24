package org.example;

import HelperPages.AddClient;
import HelperPages.Login;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Open Browser

            Login.loginApp();
            AddClient.addClient("Medhat");
//            SearchClient.searchClient();
//            ClientsActions.clientsActions();
//            UpdateClient.updateClient();
//            SearchClient.searchClient();
//            Logout.logoutApp();
    }

}