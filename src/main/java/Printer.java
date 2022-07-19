public class Printer {

    private int paperRemaining;
    private int tonerRemaining;

    public Printer(int paperRemaining, int tonerRemaining){
        this.paperRemaining = paperRemaining;
        this.tonerRemaining = tonerRemaining;
    }

    public int getPaperRemaining(){
        return this.paperRemaining;
    }

    public int getTonerRemaining(){
        return this.tonerRemaining;
    }

    public void print(int pagesToCopy, int numberOfCopies){
        int totalToPrint = pagesToCopy * numberOfCopies;
        if (totalToPrint < this.paperRemaining && totalToPrint < this.tonerRemaining){
            this.paperRemaining -= totalToPrint;
            this.tonerRemaining -= totalToPrint;
        }
    }
}
