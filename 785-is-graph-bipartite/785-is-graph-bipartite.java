class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean[] colored = new boolean[graph.length];
        boolean[] visited = new boolean[graph.length];
        boolean ans = true;
        for(int i = 0; i < graph.length; i++){
            if(graph[i].length > 0 && !visited[i]) {
                ans = ans && bfs(i, visited, colored, graph);
            }
        }
        return ans;
    }
    public boolean bfs(int i, boolean[] visited, boolean[] colored, int graph[][]){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(i);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int neighbor : graph[curr]){
                if(visited[neighbor] || q.contains(neighbor)){
                    if (colored[curr] == colored[neighbor]) return false;
                    continue;
                }
                colored[neighbor] = !colored[curr];
                q.offer(neighbor);
            }
            visited[curr] = true;
        }
        return true;
    }
}