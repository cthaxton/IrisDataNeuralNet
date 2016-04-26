//Crysta Thaxton
//Final Project
//Iris Data Set
//Artificial Neural Network
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.util.TransferFunctionType;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        double sepalLen;
        double sepalWid;
        double petalLen;
        double petalWid;
        //Loading saved Neural Network

        System.out.println("Iris Data Set \n Please enter the measurements of your Iris below.");
        NeuralNetwork loadedMlPerceptron = NeuralNetwork.createFromFile("3Layer3.nnet");

        System.out.println("Sepal Length: ");
        Scanner input = new Scanner(System.in);
        String sepalLenInput = input.nextLine();
        sepalLen = Double.parseDouble(sepalLenInput);


        System.out.println("Sepal Width: ");
        String sepalWidInput = input.nextLine();
        sepalWid = Double.parseDouble(sepalWidInput);

        System.out.println("Petal Length: ");
        String petalLenInput = input.nextLine();
        petalLen = Double.parseDouble(petalLenInput);

        System.out.println("Petal Width: ");
        String petalWidInput = input.nextLine();
        petalWid = Double.parseDouble(petalWidInput);

        DataSet testSet = new DataSet(4, 3);
        testSet.addRow(new DataSetRow(sepalLen, sepalWid, petalLen, petalWid));


    }
    public void testNeuralNetwork(NeuralNetwork nnet, DataSet test){
        for(DataSetRow dataRow: test.getRows()) {
            nnet.setInput(dataRow.getInput());
            nnet.calculate();
            double[] networkOutput = nnet.getOutput();
            System.out.println(" Output: " + Arrays.toString(networkOutput) );
        }
    }
}