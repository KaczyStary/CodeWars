package org.Piotrowski;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaterialCounter {
    public int material(int[] spaceship){
        List<Integer> spaceshipAsList = new java.util.ArrayList<>(Arrays.stream(spaceship).boxed().toList());

        return splitListGetMaterial(spaceshipAsList, true) + splitListGetMaterial(spaceshipAsList, false);
    }

    private int splitListGetMaterial(List<Integer> spaceshipAsList, boolean isLeftSide) {
        if (isLeftSide){
            List<Integer> spaceshipAsListLeft = spaceshipAsList.subList(0, (findPositionOfFirstBiggestNumInPassedList(spaceshipAsList)+1));

            return getMaterial(spaceshipAsListLeft);
        }else {
            List<Integer> spaceShipAsListRight = spaceshipAsList.subList(findPositionOfFirstBiggestNumInPassedList(spaceshipAsList), spaceshipAsList.size());
            Collections.reverse(spaceShipAsListRight);

            return getMaterial(spaceShipAsListRight);
        }
    }

    private int findPositionOfFirstBiggestNumInPassedList(List<Integer> passedList){
        return passedList.indexOf(passedList.stream().max(Integer::compare).get());
    }

    private int getMaterial(List<Integer> spaceshipAsList) {
        int currentIteration = 0;
        int referenceNum = spaceshipAsList.get(currentIteration);

        return calcMaterial(currentIteration, referenceNum, spaceshipAsList);
    }

    private int calcMaterial(int currentIteration, int referenceNum, List<Integer> spaceshipAsList) {
        List<Integer> subSpaceShipAsList = spaceshipAsList.subList((++currentIteration), spaceshipAsList.size());
        int sum = 0;

        while (currentIteration<spaceshipAsList.size()){

            for (int i = 0; i < subSpaceShipAsList.size(); i++) {

                if (referenceNum <= subSpaceShipAsList.get(i)){

                    List<Integer> subSubList = subSpaceShipAsList.subList(0, i);

                    sum += sumMaterial(referenceNum, subSubList);

                    referenceNum=subSpaceShipAsList.get(i);
                    subSpaceShipAsList = spaceshipAsList.subList((++currentIteration), spaceshipAsList.size());
                    break;
                }

                currentIteration++;
            }

        }

        return sum;
    }

    private int sumMaterial(int referenceNum, List<Integer> passedList) {
        int sum = 0;

        for (int val: passedList) {
            sum += (referenceNum - val);
        }

        return sum;
    }

}
