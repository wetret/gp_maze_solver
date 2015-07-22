package population.evolvedagentfunctions;

import java.util.List;

import maze.Maze;
import tree.IMoveNode;
import tree.INode;
import tree.Move;


public class EvolvedAgentFunctionExample implements IMoveNode{

    @Override
    public Move evaluate(Maze pMaze) {
        // add the generated agent function from GeneticProgramming.evolve() here.
        // remove "return null"
        
       if ( pMaze.isWallEast() ) { if ( ( ( !( ( ( ( ( !( !( ( pMaze.isWallSouthEast() || pMaze.isWallNorthWest() ) ) ) || ( !( !( pMaze.isWallSouth() ) ) || !( ( ( !( ( pMaze.isWallSouthEast() || pMaze.isWallSouth() ) ) || ( ( ( pMaze.isWallSouthEast() && pMaze.isWallSouthEast() ) || ( pMaze.isWallNorth() || ( pMaze.isWallEast() && ( pMaze.isWallEast() && !( ( ( ( ( !( pMaze.isWallSouthWest() ) || ( ( pMaze.isWallEast() && !( ( pMaze.isWallSouth() || !( ( ( pMaze.isWallSouthWest() && pMaze.isWallNorthEast() ) || pMaze.isWallNorth() ) ) ) ) ) || pMaze.isWallNorthEast() ) ) && pMaze.isWallNorthWest() ) || pMaze.isWallSouthEast() ) && ( !( !( !( pMaze.isWallSouth() ) ) ) && pMaze.isWallSouth() ) ) ) ) ) ) ) || pMaze.isWallSouthEast() ) ) && ( pMaze.isWallSouth() || pMaze.isWallNorth() ) ) ) ) ) && !( !( ( pMaze.isWallNorth() && !( pMaze.isWallSouth() ) ) ) ) ) || !( !( !( ( ( pMaze.isWallSouth() && pMaze.isWallSouthWest() ) && ( pMaze.isWallSouthEast() && pMaze.isWallSouth() ) ) ) ) ) ) || pMaze.isWallNorthWest() ) ) && ( !( !( !( ( ( pMaze.isWallSouthWest() || pMaze.isWallNorthWest() ) || pMaze.isWallSouth() ) ) ) ) || pMaze.isWallSouthEast() ) ) && pMaze.isWallSouthEast() ) ) { if ( pMaze.isWallNorthEast() ) { if ( pMaze.isWallEast() ) { return Move.EAST; } else { if ( pMaze.isWallSouthWest() ) { if ( ( ( ( pMaze.isWallSouthEast() && pMaze.isWallSouth() ) && pMaze.isWallSouthEast() ) && !( pMaze.isWallSouthWest() ) ) ) { return Move.EAST; } else { return Move.WEST; } } else { return Move.SOUTH; } } } else { return Move.NORTH; } } else { if ( !( pMaze.isWallEast() ) ) { return Move.NORTH; } else { if ( ( pMaze.isWallSouthWest() || ( ( pMaze.isWallSouthWest() && ( pMaze.isWallSouthWest() || ( ( !( pMaze.isWallSouthEast() ) || !( !( pMaze.isWallSouthWest() ) ) ) || !( pMaze.isWallSouthEast() ) ) ) ) || !( !( pMaze.isWallEast() ) ) ) ) ) { if ( !( pMaze.isWallNorthWest() ) ) { return Move.NORTH; } else { return Move.SOUTH; } } else { if ( pMaze.isWallEast() ) { if ( ( ( ( ( ( pMaze.isWallNorthEast() && pMaze.isWallNorthWest() ) || pMaze.isWallSouth() ) || ( ( pMaze.isWallEast() || pMaze.isWallSouth() ) && !( ( !( pMaze.isWallNorth() ) && ( ( !( !( pMaze.isWallNorth() ) ) && ( pMaze.isWallEast() || !( pMaze.isWallEast() ) ) ) || pMaze.isWallSouthWest() ) ) ) ) ) && pMaze.isWallSouthEast() ) && ( ( ( pMaze.isWallNorthEast() || pMaze.isWallEast() ) && pMaze.isWallNorthEast() ) || !( pMaze.isWallNorth() ) ) ) ) { if ( ( ( !( ( pMaze.isWallSouthWest() || !( ( !( ( ( !( pMaze.isWallSouth() ) && pMaze.isWallSouth() ) && ( ( !( ( pMaze.isWallEast() || !( pMaze.isWallNorthWest() ) ) ) || ( ( pMaze.isWallEast() && ( !( !( pMaze.isWallNorth() ) ) && ( ( ( ( !( ( !( pMaze.isWallSouthEast() ) || ( !( pMaze.isWallNorthEast() ) || pMaze.isWallNorthEast() ) ) ) && pMaze.isWallSouth() ) && !( pMaze.isWallNorthEast() ) ) && ( !( ( pMaze.isWallSouth() && ( ( pMaze.isWallNorth() && !( !( pMaze.isWallNorthWest() ) ) ) && ( ( ( ( pMaze.isWallSouth() && !( ( !( !( ( pMaze.isWallNorthWest() && !( pMaze.isWallNorthEast() ) ) ) ) && !( pMaze.isWallNorthWest() ) ) ) ) && ( pMaze.isWallEast() || !( ( pMaze.isWallSouth() && pMaze.isWallSouth() ) ) ) ) && !( pMaze.isWallSouth() ) ) || !( pMaze.isWallNorthWest() ) ) ) ) ) && pMaze.isWallNorth() ) ) || pMaze.isWallNorthWest() ) ) ) || !( ( pMaze.isWallNorthEast() && !( pMaze.isWallNorth() ) ) ) ) ) && pMaze.isWallNorthEast() ) ) ) || !( pMaze.isWallSouthEast() ) ) ) ) ) || pMaze.isWallEast() ) && !( ( ( !( ( ( pMaze.isWallSouth() && !( ( pMaze.isWallSouthEast() || pMaze.isWallNorthEast() ) ) ) || ( ( pMaze.isWallNorthWest() || ( ( !( ( pMaze.isWallSouthEast() && !( ( pMaze.isWallNorthWest() || ( pMaze.isWallNorth() && pMaze.isWallSouthWest() ) ) ) ) ) && ( pMaze.isWallEast() || pMaze.isWallSouth() ) ) && pMaze.isWallNorth() ) ) && !( pMaze.isWallEast() ) ) ) ) && pMaze.isWallSouthEast() ) && ( ( ( ( ( ( pMaze.isWallNorthWest() || ( pMaze.isWallSouthEast() || pMaze.isWallNorth() ) ) || pMaze.isWallSouth() ) && pMaze.isWallSouthEast() ) || pMaze.isWallNorthWest() ) && ( !( !( !( ( ( ( ( pMaze.isWallNorth() && ( !( pMaze.isWallNorthWest() ) && ( !( pMaze.isWallNorthEast() ) && pMaze.isWallEast() ) ) ) || pMaze.isWallNorth() ) || ( pMaze.isWallSouthEast() || pMaze.isWallNorth() ) ) && ( pMaze.isWallNorth() && pMaze.isWallEast() ) ) ) ) ) || ( pMaze.isWallEast() && !( pMaze.isWallNorthEast() ) ) ) ) && ( ( ( pMaze.isWallNorth() || pMaze.isWallNorth() ) && ( !( pMaze.isWallNorthWest() ) || ( ( pMaze.isWallNorthWest() || pMaze.isWallNorthEast() ) && pMaze.isWallEast() ) ) ) && pMaze.isWallNorthEast() ) ) ) ) ) ) { return Move.NORTH; } else { if ( ( pMaze.isWallNorthEast() || !( ( ( !( ( pMaze.isWallSouthWest() && ( ( ( pMaze.isWallSouth() && ( pMaze.isWallSouthWest() || ( ( ( ( ( ( ( ( pMaze.isWallEast() && ( pMaze.isWallSouthEast() && ( ( ( ( pMaze.isWallEast() && ( ( !( ( pMaze.isWallNorthWest() || ( ( ( !( ( pMaze.isWallEast() && !( !( pMaze.isWallNorthEast() ) ) ) ) || pMaze.isWallNorth() ) || pMaze.isWallNorthEast() ) && !( !( pMaze.isWallNorthEast() ) ) ) ) ) || ( ( !( pMaze.isWallSouthWest() ) || ( ( pMaze.isWallSouthEast() && pMaze.isWallSouthWest() ) || pMaze.isWallNorthEast() ) ) && pMaze.isWallSouthWest() ) ) && ( !( ( ( ( pMaze.isWallEast() && !( ( !( pMaze.isWallSouthEast() ) || ( pMaze.isWallEast() || pMaze.isWallNorth() ) ) ) ) && ( ( ( pMaze.isWallSouthEast() || pMaze.isWallSouth() ) || ( pMaze.isWallNorth() || !( pMaze.isWallEast() ) ) ) || ( ( !( pMaze.isWallNorth() ) || !( pMaze.isWallSouthWest() ) ) || !( ( ( ( !( pMaze.isWallNorth() ) || ( ( ( pMaze.isWallNorthEast() && ( ( ( !( pMaze.isWallNorth() ) || pMaze.isWallNorth() ) && pMaze.isWallEast() ) && pMaze.isWallNorthWest() ) ) && pMaze.isWallEast() ) || pMaze.isWallSouthEast() ) ) || ( pMaze.isWallSouth() && !( ( !( pMaze.isWallNorthWest() ) && pMaze.isWallNorthWest() ) ) ) ) || ( ( pMaze.isWallSouthWest() || pMaze.isWallNorthEast() ) || pMaze.isWallNorth() ) ) ) ) ) ) && ( ( ( ( ( pMaze.isWallNorth() && pMaze.isWallSouthWest() ) && !( pMaze.isWallSouth() ) ) && pMaze.isWallNorth() ) && !( ( ( pMaze.isWallNorth() && !( !( pMaze.isWallEast() ) ) ) && pMaze.isWallSouthWest() ) ) ) && !( ( ( !( pMaze.isWallSouth() ) || ( ( pMaze.isWallSouthEast() && !( ( ( pMaze.isWallEast() && ( ( ( pMaze.isWallNorthEast() || !( ( pMaze.isWallNorth() && ( pMaze.isWallNorth() && pMaze.isWallSouth() ) ) ) ) && pMaze.isWallSouthEast() ) || !( pMaze.isWallSouth() ) ) ) || pMaze.isWallSouth() ) ) ) && ( pMaze.isWallNorthEast() && !( !( pMaze.isWallEast() ) ) ) ) ) || !( pMaze.isWallNorthEast() ) ) ) ) ) ) || ( pMaze.isWallNorth() || pMaze.isWallNorthWest() ) ) ) ) && pMaze.isWallSouth() ) || pMaze.isWallSouthWest() ) || !( !( pMaze.isWallSouth() ) ) ) ) ) && ( ( ( ( ( ( ( ( pMaze.isWallEast() || ( ( !( pMaze.isWallNorthWest() ) || pMaze.isWallNorthWest() ) || !( pMaze.isWallNorthWest() ) ) ) || !( pMaze.isWallNorth() ) ) || ( ( pMaze.isWallSouthEast() || ( ( pMaze.isWallNorth() || !( !( ( pMaze.isWallSouthEast() && pMaze.isWallNorthEast() ) ) ) ) || ( !( pMaze.isWallSouthWest() ) || pMaze.isWallSouthEast() ) ) ) && ( pMaze.isWallSouthEast() && !( ( ( pMaze.isWallNorthEast() || ( pMaze.isWallSouthWest() || pMaze.isWallEast() ) ) && !( ( pMaze.isWallNorthEast() && pMaze.isWallSouthEast() ) ) ) ) ) ) ) || pMaze.isWallSouthEast() ) && pMaze.isWallSouth() ) || pMaze.isWallSouth() ) || ( ( ( !( ( ( ( !( pMaze.isWallSouth() ) && ( !( pMaze.isWallNorthEast() ) && pMaze.isWallNorthWest() ) ) || ( ( pMaze.isWallSouth() || ( pMaze.isWallSouthWest() || ( !( pMaze.isWallSouth() ) && pMaze.isWallSouth() ) ) ) || ( !( ( pMaze.isWallNorth() && pMaze.isWallNorth() ) ) || ( ( !( pMaze.isWallEast() ) && !( pMaze.isWallEast() ) ) || !( pMaze.isWallNorthWest() ) ) ) ) ) && pMaze.isWallEast() ) ) || pMaze.isWallSouthEast() ) || pMaze.isWallEast() ) && ( ( ( pMaze.isWallSouthWest() && pMaze.isWallNorthWest() ) && ( !( pMaze.isWallNorthEast() ) || pMaze.isWallNorthEast() ) ) || ( ( ( pMaze.isWallNorthEast() || ( !( pMaze.isWallSouthWest() ) && ( ( pMaze.isWallEast() && pMaze.isWallNorth() ) && !( pMaze.isWallNorthWest() ) ) ) ) || ( !( pMaze.isWallSouthWest() ) || pMaze.isWallNorth() ) ) && !( pMaze.isWallNorthEast() ) ) ) ) ) && !( ( pMaze.isWallSouthWest() && ( pMaze.isWallNorth() || ( pMaze.isWallSouth() && ( !( pMaze.isWallNorthWest() ) || pMaze.isWallNorth() ) ) ) ) ) ) ) && pMaze.isWallNorthEast() ) && ( ( !( ( pMaze.isWallNorthEast() && ( ( ( !( !( pMaze.isWallNorthEast() ) ) || pMaze.isWallNorth() ) && pMaze.isWallSouthEast() ) && pMaze.isWallSouthWest() ) ) ) && pMaze.isWallSouthWest() ) || ( pMaze.isWallNorthWest() && !( pMaze.isWallNorthEast() ) ) ) ) || ( pMaze.isWallNorthWest() && pMaze.isWallSouthEast() ) ) && pMaze.isWallEast() ) && ( pMaze.isWallNorthEast() || ( ( ( pMaze.isWallSouth() && pMaze.isWallNorth() ) || ( ( ( pMaze.isWallSouthEast() || pMaze.isWallEast() ) || ( !( pMaze.isWallSouth() ) && !( pMaze.isWallNorthEast() ) ) ) || !( !( pMaze.isWallNorthEast() ) ) ) ) || ( pMaze.isWallNorth() || pMaze.isWallNorth() ) ) ) ) || pMaze.isWallNorth() ) ) ) && ( ( ( pMaze.isWallNorthWest() || pMaze.isWallNorthEast() ) || ( pMaze.isWallSouthEast() || ( ( pMaze.isWallSouth() && ( pMaze.isWallSouthWest() || pMaze.isWallNorthWest() ) ) || !( ( pMaze.isWallNorth() && ( pMaze.isWallSouthWest() || ( pMaze.isWallNorthWest() || pMaze.isWallNorthEast() ) ) ) ) ) ) ) || ( ( pMaze.isWallNorthWest() || ( ( !( ( !( ( !( pMaze.isWallNorth() ) || !( pMaze.isWallSouthWest() ) ) ) && pMaze.isWallEast() ) ) && pMaze.isWallEast() ) && ( !( pMaze.isWallNorth() ) && !( ( pMaze.isWallSouth() && ( pMaze.isWallSouthWest() || ( pMaze.isWallNorth() || pMaze.isWallNorthWest() ) ) ) ) ) ) ) || pMaze.isWallNorthWest() ) ) ) || ( pMaze.isWallSouthEast() && !( ( pMaze.isWallEast() && !( pMaze.isWallSouth() ) ) ) ) ) ) ) && pMaze.isWallEast() ) && pMaze.isWallSouthWest() ) ) ) ) { return Move.NORTH; } else { return Move.WEST; } } } else { return Move.NORTH; } } else { if ( pMaze.isWallSouth() ) { return Move.SOUTH; } else { if ( ( ( pMaze.isWallNorth() || ( pMaze.isWallNorthEast() || pMaze.isWallNorthEast() ) ) || ( pMaze.isWallSouth() && pMaze.isWallNorthEast() ) ) ) { return Move.WEST; } else { if ( ( !( pMaze.isWallNorthEast() ) || ( !( ( pMaze.isWallEast() && pMaze.isWallSouth() ) ) || !( pMaze.isWallNorthEast() ) ) ) ) { if ( !( pMaze.isWallEast() ) ) { return Move.NORTH; } else { return Move.SOUTH; } } else { return Move.EAST; } } } } } } } } else { return Move.EAST; }
       // return null;
    }

    @Override
    public String evaluationToString() {
        // leave as is
        return null;
    }

    @Override
    public List<INode> getFlattenedTree() {
        // leave as is
        return null;
    }

    @Override
    public INode getParent() {
        // leave as is
        return null;
    }

    @Override
    public void setParent(INode pParent) {
       // leave as is  
    }

    @Override
    public INode getCopy() {
        // leave as is
        return null;
    }

}
