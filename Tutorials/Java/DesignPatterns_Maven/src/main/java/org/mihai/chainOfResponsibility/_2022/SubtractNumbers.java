package chainOfResponsibility._2022;

public class SubtractNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void solveRequest(Numbers request) {

        if (request.getCalcWanted() == "sub") {

            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = " +
                    (request.getNumber1() - request.getNumber2()));

        } else {

            nextInChain.solveRequest(request);

        }

    }


}