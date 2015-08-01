package population;

import maze.Maze;
import tree.IMoveNode;
import tree.Move;
import utils.Config;


public class Agent {
    
    private IMoveNode mRoot;

    private Maze mMaze;
    
    private int mAgentXCord;
    private int mAgentYCord;
    
    private int mFitness;
    private boolean mGoalReached;
    private int mCollectedWayPoints;
    
   public Agent(IMoveNode pRoot, Maze pMaze) {
        mRoot = pRoot;
        mMaze = pMaze;
        
        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();
        
        mFitness = 100000;
        mGoalReached = false;
        mCollectedWayPoints = 0;
   }
   

   public Agent(Agent pAgent) {
       mRoot = (IMoveNode) pAgent.getEvaluationTree().getCopy();
       mMaze = new Maze();
       
       mAgentXCord = Config.DEFAULT.getAgentXCordStart();
       mAgentYCord = Config.DEFAULT.getAgentYCordStart();
       
       mFitness = 100000;
   }


public boolean move(){
       Move move = mRoot.evaluate(mMaze);
       
       switch(move){
           case NORTH:
               if(!mMaze.isWallNorth()){ 
                   mAgentYCord = mAgentYCord - 1;
               }
               break;
           case EAST:
               if(!mMaze.isWallEast()){ 
                   mAgentXCord = mAgentXCord + 1;
               }
               break;
           case SOUTH:
               if(!mMaze.isWallSouth()){ 
                   mAgentYCord = mAgentYCord + 1;
               }
               break;
           case WEST:
               if(!mMaze.isWallWest()){ 
                   mAgentXCord = mAgentXCord - 1;
               }
               break;
       }
       
       if(goalReached()){
           System.out.println("FOUND ESCAPE!!");
           return false;
       }
       
       mMaze.setNewAgentCord(mAgentXCord, mAgentYCord);
       return true;
   }
   
   private boolean goalReached(){
       if(mMaze.getGrid()[mAgentXCord][mAgentYCord] == Config.DEFAULT.getGoalPosition()){
           return true;
       } else {
           return false;
       }
   }
   
   public int getXCord(){
       return mAgentXCord;
   }
   
   public int getYCord(){
       return mAgentYCord;
   }
   
   public IMoveNode getEvaluationTree(){
       return mRoot;
   }
   
   public int getFitness() {
       return mFitness;
   }
   
   public void setFitness(int pFitness) {
       mFitness = pFitness;
   }
   
   public void setRoot(IMoveNode pRoot) {
       mRoot = pRoot;
   }
   
   public Maze getMaze() {
       return mMaze;
   }
   
   public void setAgentXCord(int pAgentXCord) {
       mAgentXCord = pAgentXCord;
   }

   public void setAgentYCord(int pAgentYCord) {
       mAgentYCord = pAgentYCord;
   }
   
   public Agent getCopy(){
       return new Agent(this);
   }
   
   public void resetTestRun(){
       mAgentXCord = Config.DEFAULT.getAgentXCordStart();
       mAgentYCord = Config.DEFAULT.getAgentYCordStart();
       mMaze.setNewAgentCord(Config.DEFAULT.getAgentXCordStart(), Config.DEFAULT.getAgentYCordStart());
       
       mGoalReached = false;
       mCollectedWayPoints = 0;
   }

}
