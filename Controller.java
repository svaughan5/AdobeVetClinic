package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    public Button addClientBtn;
    public Button appointmentBtn;
    public Button addPatientBtn;
    public Button invoiceBtn;
    public Button searchBtn;
    public Button updateBtn;
    public Button addApptBtn;
    public Button cancelApptBtn;
    public Button searchApptBtn;
    public Label clientNameLbl;
    public Label patientNamelbl;
    public Label dateLbl;
    public TextField clientTxt;
    public TextField patientTxt;
    public DatePicker dateTxt;
    public TextField timeTxt;
    public Label timeLbl;
    public Button addApptFinalBtn;
    public Button cancelApptFinalBtn;
    public Button searchApptFinalBtn;
    public Label lastActionLbl;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        
    }

    //**************** METHODS FOR EACH WINDOW **************************

    public void displayApptScreen(ActionEvent actionEvent) throws Exception {
        Parent apptRoot = FXMLLoader.load(getClass().getResource("appointment.fxml"));

        Stage appointmentStage = new Stage();
        appointmentStage.setTitle("Appointments");
        appointmentStage.setScene(new Scene(apptRoot, 556, 494));
        appointmentStage.show();

    }

    public void displayAddClientScreen(ActionEvent actionEvent) throws Exception{
        Parent addClientRoot = FXMLLoader.load(getClass().getResource("addClient.fxml"));

        Stage addClientStage = new Stage();
        addClientStage.setTitle("Add Client");
        addClientStage.setScene(new Scene(addClientRoot, 350, 250));
        addClientStage.show();
    }

    public void displayAddPatientScreen(ActionEvent actionEvent) throws Exception{
        Parent addPatientRoot = FXMLLoader.load(getClass().getResource("addPatient.fxml"));

        Stage addPatientStage = new Stage();
        addPatientStage.setTitle("Add Patient");
        addPatientStage.setScene(new Scene(addPatientRoot, 350, 250));
        addPatientStage.show();
    }

    public void displayInvoiceScreen(ActionEvent actionEvent) throws Exception{
        Parent invoiceRoot = FXMLLoader.load(getClass().getResource("invoice.fxml"));

        Stage invoiceStage = new Stage();
        invoiceStage.setTitle("Invoice");
        invoiceStage.setScene(new Scene(invoiceRoot, 556, 494));
        invoiceStage.show();
    }

    public void displaySearchScreen(ActionEvent actionEvent) throws Exception{
        Parent searchRoot = FXMLLoader.load(getClass().getResource("searchClient.fxml"));

        Stage searchStage = new Stage();
        searchStage.setTitle("Database Search");
        searchStage.setScene(new Scene(searchRoot, 556, 494));
        searchStage.show();
    }

    public void displayUpdateScreen(ActionEvent actionEvent) throws Exception{
        Parent updateRoot = FXMLLoader.load(getClass().getResource("updateClient.fxml"));

        Stage updateStage = new Stage();
        updateStage.setTitle("Update Information");
        updateStage.setScene(new Scene(updateRoot, 350, 250));
        updateStage.show();
    }

    // ***************** END OF WINDOW METHODS *************************

    //****************** APPOINTMENT WINDOW METHODS *************************

    public void showAddApptInfo(ActionEvent actionEvent) throws Exception{
        clientNameLbl.setVisible(true);
        patientNamelbl.setVisible(true);
        dateLbl.setVisible(true);
        clientTxt.setVisible(true);
        patientTxt.setVisible(true);
        dateTxt.setVisible(true);
        timeLbl.setVisible(true);
        timeTxt.setVisible(true);
        addApptFinalBtn.setVisible(true);
    }

    public void showCancelApptInfo(ActionEvent actionEvent) throws Exception{
        clientNameLbl.setVisible(true);
        patientNamelbl.setVisible(true);
        dateLbl.setVisible(false);
        clientTxt.setVisible(true);
        patientTxt.setVisible(true);
        dateTxt.setVisible(false);
        timeLbl.setVisible(false);
        timeTxt.setVisible(false);
        cancelApptFinalBtn.setVisible(true);
        addApptFinalBtn.setVisible(false);
        searchApptFinalBtn.setVisible(false);
    }

    public void showSearchApptInfo(ActionEvent actionEvent) throws Exception{
        clientNameLbl.setVisible(true);
        patientNamelbl.setVisible(true);
        dateLbl.setVisible(false);
        clientTxt.setVisible(true);
        patientTxt.setVisible(true);
        dateTxt.setVisible(false);
        timeLbl.setVisible(false);
        timeTxt.setVisible(false);
        addApptFinalBtn.setVisible(false);
        cancelApptFinalBtn.setVisible(false);
        searchApptFinalBtn.setVisible(true);
    }

    public void addAppointment(ActionEvent actionEvent)throws Exception{
        lastActionLbl.setText("Scheduled appointment for " + patientTxt.getText() +  " on " + dateTxt.getValue()
                + " at " + timeTxt.getText() + ".");
        lastActionLbl.setVisible(true);
    }

    public void cancelAppointment(ActionEvent actionEvent)throws Exception{
        lastActionLbl.setText("Cancelled appointment for " + patientTxt.getText() + ".");
        lastActionLbl.setVisible(true);
    }

    public void searchAppointment(ActionEvent actionEvent)throws Exception{
        lastActionLbl.setText("Searched appointments for " + patientTxt.getText() + ".");
        lastActionLbl.setVisible(true);
    }

}
