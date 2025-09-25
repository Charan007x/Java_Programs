class bank{
    private String pin="Charan007x";
    public String getPin(){
        return pin;
    }
}
class details{
    public static void main(String[] args) {
        bank b = new bank();
        System.out.println(b.getPin());
    }
}
