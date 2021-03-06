package tree.evaluationnodes.unarynodes;

import java.util.ArrayList;
import java.util.List;

import tree.EOrientation;
import tree.IEvaluationNode;
import tree.IEvaluationNonTerminal;
import tree.INode;
import tree.NodeBuilder;
import maze.Maze;


public class NotNode
        implements IEvaluationNode, IEvaluationNonTerminal {

    private List<IEvaluationNode> mChildren;

    public NotNode() {
        mChildren = new ArrayList<IEvaluationNode>(1);
        setChildren();
    }

    // Copy constructor
    private NotNode(NotNode pToCopy) {
        mChildren = new ArrayList<IEvaluationNode>(1);
        mChildren.add((IEvaluationNode) pToCopy.getChildren().get(0).getCopy());
    }

    @Override
    public boolean evaluate(Maze pMaze, EOrientation pOrientation) {
        return !mChildren.get(0).evaluate(pMaze, pOrientation);
    }

    @Override
    public String evaluationToString() {
        return "!( " + mChildren.get(0).evaluationToString() + " )";
    }

    private void setChildren() {
        mChildren.add(NodeBuilder.getEvaluationNode());
    }

    @Override
    public List<INode> getFlattenedTree() {
        List<INode> nodes = new ArrayList<INode>();
        nodes.add(this);

        nodes.addAll(mChildren.get(0).getFlattenedTree());

        return nodes;
    }

    @Override
    public List<IEvaluationNode> getChildren() {
        return mChildren;
    }

    @Override
    public void setChild(int pPosition, IEvaluationNode pNewChild) {
        mChildren.set(0, (IEvaluationNode) pNewChild);
    }

    @Override
    public INode getCopy() {
        return new NotNode(this);
    }
}
