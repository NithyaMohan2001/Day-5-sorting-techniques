public 
class BucketSort<T extends Number & Comparable<T>>{
  public List<T> sort(List<T> list,BiFunction<T,Integer,Integer> function){
    int noofbkts=list.size();
    Map<Integer,List<T>> buckets=new HashMap<>();
    IntStream.range(0,noofbkts),forEach(i->buckets.put(i,new LinkedList<>());
    list.forEach(item->buckets.get(function.apply(item,noofbkts)).add(item));
    buckets.values().forEach(Collections::sort);
    return buckets.values().Stream().flatMap(Collection::stream).toList();
    }
                                        
            public static void main(String args[]){
             List<Float> floats=Arrays.asList(0.42F,0.32F,0.63F,0.82F);
             print(new BucketSort<Float>().sort(floats,(item,size)->(int)(item/size)));
                                        
                                        
