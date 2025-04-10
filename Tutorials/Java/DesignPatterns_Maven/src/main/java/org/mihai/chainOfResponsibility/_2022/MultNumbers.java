package chainOfResponsibility._2022;

public class MultNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void solveRequest(Numbers request) {

        if (request.getCalcWanted() == "mult") {

            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = " +
                    (request.getNumber1() * request.getNumber2()));

        } else {

            System.out.println("Only works for add, sub, mult");

        }

    }


}