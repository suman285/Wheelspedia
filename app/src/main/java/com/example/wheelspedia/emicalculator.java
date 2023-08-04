package com.example.wheelspedia;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

import android.os.Bundle;

public class emicalculator extends AppCompatActivity {
    private EditText editTextLoanAmount, editTextInterestRate, editTextTenure;
    private Button buttonCalculate;
    private TextView textViewEmi, textViewTotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emicalculator);

        // Initialize UI components
        editTextLoanAmount = findViewById(R.id.editTextLoanAmount);
        editTextInterestRate = findViewById(R.id.editTextInterestRate);
        editTextTenure = findViewById(R.id.editTextTenure);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewEmi = findViewById(R.id.textViewEmi);
        textViewTotalAmount = findViewById(R.id.textViewTotalAmount);

        // Handle button click event
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateEmi();
            }
        });
    }

    private void calculateEmi() {
        // Get input values
        double loanAmount = Double.parseDouble(editTextLoanAmount.getText().toString());
        double interestRate = Double.parseDouble(editTextInterestRate.getText().toString());
        int tenure = Integer.parseInt(editTextTenure.getText().toString());

        // Calculate EMI
        double monthlyInterestRate = interestRate / 12 / 100;
        double emi = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenure)
                / (Math.pow(1 + monthlyInterestRate, tenure) - 1);

        // Calculate total loan amount
        double totalAmount = emi * tenure;

        // Format the results to display two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedEmi = decimalFormat.format(emi);
        String formattedTotalAmount = decimalFormat.format(totalAmount);

        // Display the results
        textViewEmi.setText("Your EMI will be : " + formattedEmi +"per Month");
        textViewTotalAmount.setText("Total Loan Amount: " + formattedTotalAmount);
    }
}



