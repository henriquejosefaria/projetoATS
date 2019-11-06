package tests.java;

import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Tree;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree.Kind;
import java.util.Collections;
import java.util.List;

@Rule(key = "MyFirstCustomRule")
public class FistRedSmell extends IssuableSubscriptionVisitor {

    @Override
    public List<Kind> nodesToVisit() {
        return Collections.singletonList(Tree.Kind.METHOD); // visito apenas metodos na classes
    }

    @Override
    public void visitNode(Tree tree) {
        MethodTree method = (MethodTree) tree;
        if (method.parameters().size() == 1) { // verifica se o metodo recebe 1 parâmetro
            reportIssue(method.simpleName(), "Never do that!");
        }
    }

}
