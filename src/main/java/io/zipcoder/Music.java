package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }


    public Integer selection(Integer startIndex, String selection) {
        Integer forward = 0;
        Integer backward = 0;
        Integer i = startIndex;
        while(playList[i] != selection ) {
            i++;
            forward++;
            if (i == playList.length ) {
                i = 0;
            }
        }
        i = startIndex;
        while (playList[i] != selection) {
            i--;
            backward++;
            if (i == -1) {
                i = playList.length-1;
            }
        }
        if (forward < backward) {
            return forward;
        } else {
            return backward;
        }
    }
}
