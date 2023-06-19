package DSA;

import java.util.*;

class Pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for(int i=1;i<numRows;i++){
            ans.add(new ArrayList<>());
            ans.get(i).add(1);
            for(int j=1;j<ans.get(i-1).size();j++){
                int ele1 = ans.get(i-1).get(j-1);
                int ele2 = ans.get(i-1).get(j);
                ans.get(i).add(ele1+ele2);
            }
            ans.get(i).add(1);
        }
        return ans;
    }
}

class Set_matrix_zero {
    public void setZeroes(int[][] matrix) {
        int[][] mat=new int[matrix.length][matrix[0].length];
        int[] row=new int[matrix.length];
        for(int i=0;i<row.length;i++){
            row[i]=1;
        }
        int[] col=new int[matrix[0].length];
        for(int i=0;i<col.length;i++){
            col[i]=1;
        }

        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(matrix[i][j]==0){
                    row[i]=0;
                    col[j]=0;
                }
            }
        }

        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}


