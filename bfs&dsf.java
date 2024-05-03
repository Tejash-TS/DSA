import java.util.*;
class graph{

    int[][] matrix;
    int edge;
    boolean[] vis;
    graph(int edge){
        this.edge=edge;
        matrix=new int[edge][edge];
        vis=new boolean[edge];
    }

   
        void read(){
            Scanner s=new Scanner(System.in);
            System.out.println("eneter addres in 0&1");
            for(int i=0;i<edge;i++){
                for(int j=0;j<edge;j++){
                    matrix[i][j]=s.nextInt();

                }
            }

        }
        void display(){
            for(int i=0;i<edge;i++){
                for(int j=0;j<edge;j++){
                    System.out.println(matrix[i][j]);
            
        }
    }
    }
    void bfs(int start){
        Scanner s=new Scanner(System.in);
      
       Queue<Integer>queue=new LinkedList<>();
       queue.offer(start);
       vis[start]=true;
       System.out.println("bsf");
       while(!queue.isEmpty()){
        int current=queue.poll();
        System.out.println(current);
        for(int i=0;i<edge;i++){
            if(matrix[current][i]==1 &&vis[i]==false){
                queue.offer(i);
                vis[i]=true;
            }
        }
    }
}
        void dfs( int start){
            Scanner s=new Scanner(System.in);
            Stack<Integer> stack=new Stack<Integer>();
            stack.push(start);
            vis[start]=true;
            System.out.println("Dsf");
            while(!stack.isEmpty()){
              int current=stack.pop();  
            System.out.println(current);
            for(int i=0;i>edge;i++){
                if(matrix[current][i]==1 && vis[i]==false){
                    stack.push(i);
                    vis[i]=true;
                }
            }
        }



        }
    }
        




      

class dsf2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter size");
        int e=s.nextInt();
        graph g= new graph(e);
        g.read();
        g.display();
        System.out.println("enter starting element");
        int start=s.nextInt();
        g.dfs(start);
        g.bfs(start);


        
    }
    
}

    


