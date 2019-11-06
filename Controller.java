package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
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
    public TextField regClientNameTxt;
    public Button regClientBtn;
    public TextField regClientEmailTxt;
    public DatePicker regClientDobTxt;
    public TextField clientSearchNameTxt;
    public TextField clientSearchEmailTxt;
    public Button searchPatientsBtn;
    public Button searchApptHistoryBtn;
    public Button searchPaymentHistoryBtn;
    public Button updatePatientBtn;
    public Button updateClientBtn;
    public Label oneLbl;
    public TextField twoTxt;
    public Label twoLbl;
    public Label threeLbl;
    public Label fourLbl;
    public TextField oneTxt;
    public TextField threeTxt;
    public TextField fourTxt;
    public Button clientFinalUpdateBtn;
    public Button patientFinalUpdateBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        
    }

    //**************** METHODS FOR EACH WINDOW **************************

    //Appointment screen
    public void displayApptScreen(ActionEvent actionEvent) throws Exception {
        Parent apptRoot = FXMLLoader.load(getClass().getResource("appointment.fxml"));

        Stage appointmentStage = new Stage();
        appointmentStage.setTitle("Appointments");
        appointmentStage.setScene(new Scene(apptRoot, 556, 494));
        appointmentStage.show();

        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    //Add Client
    public void displayAddClientScreen(ActionEvent actionEvent) throws Exception{
        Parent addClientRoot = FXMLLoader.load(getClass().getResource("addClient.fxml"));

        Stage addClientStage = new Stage();
        addClientStage.setTitle("Add Client");
        addClientStage.setScene(new Scene(addClientRoot, 310, 295));
        addClientStage.show();
    }

    //Add Patient Screen
    public void displayAddPatientScreen(ActionEvent actionEvent) throws Exception{
        Parent addPatientRoot = FXMLLoader.load(getClass().getResource("addPatient.fxml"));

        Stage addPatientStage = new Stage();
        addPatientStage.setTitle("Add Patient");
        addPatientStage.setScene(new Scene(addPatientRoot, 300, 500));
        addPatientStage.show();
    }

    //Invoice screen
    public void displayInvoiceScreen(ActionEvent actionEvent) throws Exception{
        Parent invoiceRoot = FXMLLoader.load(getClass().getResource("invoice.fxml"));

        Stage invoiceStage = new Stage();
        invoiceStage.setTitle("Invoice");
        invoiceStage.setScene(new Scene(invoiceRoot, 556, 494));
        invoiceStage.show();
    }

    //Search screen
    public void displaySearchScreen(ActionEvent actionEvent) throws Exception{
        Parent searchRoot = FXMLLoader.load(getClass().getResource("searchClient.fxml"));

        Stage searchStage = new Stage();
        searchStage.setTitle("Database Search");
        searchStage.setScene(new Scene(searchRoot, 340, 400));
        searchStage.show();
    }

    //Update screen
    public void displayUpdateScreen(ActionEvent actionEvent) throws Exception{
        Parent updateRoot = FXMLLoader.load(getClass().getResource("updateClient.fxml"));

        Stage updateStage = new Stage();
        updateStage.setTitle("Update Information");
        updateStage.setScene(new Scene(updateRoot, 350, 250));
        updateStage.show();

        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    //Return to main function
    public void mainMenu(ActionEvent actionEvent){
        try{
            ((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = loader.load(getClass().getResource("Main.fxml").openStream());
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource(""))
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){

        }
    }

    //Open update all information screen
    //Update screen
    public void displayUpdateAllScreen(ActionEvent actionEvent) throws Exception{
        Parent updateAllRoot = FXMLLoader.load(getClass().getResource("updateInformation.fxml"));

        Stage updateAllStage = new Stage();
        updateAllStage.setTitle("Update Information");
        updateAllStage.setScene(new Scene(updateAllRoot, 556, 494));
        updateAllStage.show();

        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }

    // ***************** END OF WINDOW METHODS *************************

    //****************** APPOINTMENT WINDOW METHODS *************************

    //Add appt fields
    public void showAddApptInfo(ActionEvent actionEvent) throws Exception{
        //Sets all needed fields to true, gets rid of others.
        clientNameLbl.setVisible(true);
        patientNamelbl.setVisible(true);
        dateLbl.setVisible(true);
        clientTxt.setVisible(true);
        patientTxt.setVisible(true);
        dateTxt.setVisible(true);
        timeLbl.setVisible(true);
        timeTxt.setVisible(true);
        addApptFinalBtn.setVisible(true);
        cancelApptFinalBtn.setVisible(false);
        searchApptFinalBtn.setVisible(false);
    }

    //Cancel appt fields
    public void showCancelApptInfo(ActionEvent actionEvent) throws Exception{
        //Sets all needed fields to true, gets rid of others.
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

    //Search appt fields
    public void showSearchApptInfo(ActionEvent actionEvent) throws Exception{

        //Sets all needed fields to true, gets rid of others.
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

    //Add Appt
    public void addAppointment(ActionEvent actionEvent)throws Exception{
        //Displays appt info in last action.
        lastActionLbl.setText("Scheduled appointment for " + patientTxt.getText() +  " on " + dateTxt.getValue()
                + " at " + timeTxt.getText() + ".");
        lastActionLbl.setVisible(true);

        //Clears fields for another use.
        clientTxt.clear();
        patientTxt.clear();
        dateTxt.setValue(null);
        timeTxt.clear();
    }

    //Cancel Appt
    public void cancelAppointment(ActionEvent actionEvent)throws Exception{
        //Displays name of the appointment cancelled(assumes only 1 appointment can be scheduled at a time)
        lastActionLbl.setText("Cancelled appointment for " + patientTxt.getText() + ".");
        lastActionLbl.setVisible(true);

        //Clear txt fields
        clientTxt.clear();
        patientTxt.clear();
    }

    //Search Appt
    public void searchAppointment(ActionEvent actionEvent)throws Exception{

        //Set out alert to display admin appointment info(filled date and time with dummy data until we get real)
        new Alert(Alert.AlertType.INFORMATION, "There is an appointment for " + patientTxt.getText() +
                " on 9/11 at 130pm").showAndWait();

        //Displays name that was searched for.
        lastActionLbl.setText("Searched appointments for " + patientTxt.getText() + ".");
        lastActionLbl.setVisible(true);

        //Clear txt fields
        clientTxt.clear();
        patientTxt.clear();
    }

    //******************** END APPOINTMENT FUNCTIONS **********************

    //REGISTER CLIENT FUNCTION
    public void registerClient(ActionEvent actionEvent) throws Exception{
        new Alert(Alert.AlertType.INFORMATION, "This button will gather client information " +
                "then generate an id within the system for that client.").showAndWait();
    }

    //Update information information
    //Client
    public void displayClientUpdateInfo(ActionEvent actionEvent)throws Exception{
        oneLbl.setVisible(true);
        twoLbl.setVisible(true);
        threeLbl.setVisible(true);
        fourLbl.setVisible(false);
        oneLbl.setText("Client New Name:");
        twoLbl.setText("Client New Phone:");
        threeLbl.setText("Client New Email:");
        oneTxt.setVisible(true);
        twoTxt.setVisible(true);
        threeTxt.setVisible(true);
        fourTxt.setVisible(false);
        clientFinalUpdateBtn.setVisible(true);
        patientFinalUpdateBtn.setVisible(false);
    }

    //Patient
    public void displayPatientUpdateInfo(ActionEvent actionEvent)throws Exception{
        oneLbl.setVisible(true);
        twoLbl.setVisible(true);
        threeLbl.setVisible(true);
        fourLbl.setVisible(true);
        oneLbl.setText("Patient New Weight:");
        twoLbl.setText("Patient New Height:");
        threeLbl.setText("Patient New Age:");
        fourLbl.setText("Patient New Status:");
        oneTxt.setVisible(true);
        twoTxt.setVisible(true);
        threeTxt.setVisible(true);
        fourTxt.setVisible(true);
        patientFinalUpdateBtn.setVisible(true);
        clientFinalUpdateBtn.setVisible(false);
    }

}
