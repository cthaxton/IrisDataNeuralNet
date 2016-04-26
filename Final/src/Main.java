package org.neuroph.samples;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.util.TransferFunctionType;


public class Main {

    public static void main(String[] args) {
        double sepalLen;
        double sepalWid;
        double petalLen;
        double petalWid;
        //Loadigng saved Neural Network

        Scanner.out.println("Iris Data Set \n Please enter the measurements of your Iris below.")
        NeuralNetwork loadedMlPerceptron = NeuralNetwork.createFromFile("3Layer3.nnet");

        public void setInput(){
            boolean keepGoing = true;
            while(keepGoing){
                Scanner.out.println("Sepal Length: ");
                Scanner input = new Scanner(System.in);
                sepalLen = input.nextLine();

            }
    }

    public double getSepalLen(){
        return sepalLen;
    }

    public void setSepalLen(double sepalLen){
        this.sepalLen = sepalLen;
    }

    public double getSepalWid(){
        return sepalWid;
    }

    public void setSepalWid(double sepalWid){
        this.sepalWid = sepalWid;
    }

    public double getPetalLen(){
        return petalLen;
    }
    public void setPetalLen(double petalLen){
        this.petalLen = petalLen;
    }
    public double getPetalWid(){
        return petalWid;
    }
    public void setPetalWid(double petalWid){
        this.petalWid = petalWid;
    }
}
