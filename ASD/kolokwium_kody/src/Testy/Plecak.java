package Testy;

public class Plecak {
    final static int N = 6;
    final static int MAX_V = 10;

    final static int[]V = {6,2,3,2,3,1};
    final static int[]W = {6,4,5,7,10,2};

    public static void main(String[] args) {
        boolean [] rozw = new boolean[N];
        for(int i=0;i<N;i++)rozw[i]=false;

        int sumV=0, sumW=0;

        while(true)
        {
            int maxW=0, maxPoz=-1;

            for(int i=0;i<N;i++)
            {
                if(!rozw[i])
                {
                    if((sumV+V[i]<=MAX_V)&&(W[i]>maxW))
                    {
                        maxW=W[i];
                        maxPoz=i;
                    }
                }
            }
            if(maxPoz>-1)
            {
                rozw[maxPoz]=true;
                sumV+=V[maxPoz];
                sumW+=W[maxPoz];
            }else break;
        }

        System.out.println("Optymalna wartość: " + sumW);
        System.out.print("Indexy zabranych przedmiotów: ");
        for(int i=0;i<N;i++)if(rozw[i]) System.out.print(i+", ");
    }
}
