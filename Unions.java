public class Unions{
    public static List<Integer> unionres(List<Integer> input1 , List<Integer> input2){

        List<Integer> result = new ArrayList<>();

        for(int i = 0;  i < input1.size() ; i++){

            for(int j = 0; j < input2.size() ; j++){

                if(input1.get(i) == input2.get(i)){
                    continue;
                }
                else{
                    result.add(input1.get(i));
                    result.add(input2.get(j));
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

        List<Integer> input1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> input2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        System.out.println(unionres(input1 , input2));
    }
}