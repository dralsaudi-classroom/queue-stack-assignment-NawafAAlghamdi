package com.example.project;

public class QueueStackTester {
      public static <T> void split ( Queue <T> q , Queue <T> oq , Queue <T> eq ) {
                recSplit (q , oq , eq , q . length() , 1) ;
}      
            private static <T > void recSplit ( Queue <T> q , Queue <T> oq , Queue <T>
                    eq , int count , int pos) {
                    if (pos>count)
                    return;
                T element = q.serve () ;
                q . enqueue (element) ;
                    if ( pos % 2 == 1) {
                        if (!oq.full())
                            oq.enqueue (element) ;
                }
                    else {
                    if (! eq . full () )
                        eq . enqueue ( element ) ;
            }
        recSplit (q , oq , eq , count , pos + 1) ;
}


    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
        if(pq.length()==0){
            return;
        }
        
                     LinkedPQ<T> tmppq= new LinkedPQ<T>();
                   int count1 =pq.length();
                for(int i=0;i<count1;i++){
                           PQElement<T> x = pq.serve();
                           if(x.p>=p)
                            tmppq.enqueue(x.data,x.p);
                              
                }
                 int count2 = tmppq.length();
                for(int k=0;k<count2;k++){
                            PQElement<T> y= tmppq.serve();
                            pq.enqueue(y.data, y.p);
                           }
        // Write a static method remove that removes every element in the priority queue
        // having priority less than p.
        // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
        // pq: [A, 10], [D, 8], [B, 5].
    }
    public static <T> boolean search(Stack<T> st, T e)
    {          
        if(st.empty())
        return false;
        boolean flag;
        T tmp = st.pop();
        if(tmp.equals(e))
        flag=true;
        else
           flag=search(st, e);
        
        st.push(tmp);
        return flag;
      
       
    }
}