package org.sonar.samples.java.checks;
 
import com.google.common.collect.ImmutableList;
 
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree.Kind;
 
import java.util.List;
 
@Rule(key = "MyFirstCustomRule")
public class MyFirstCustomCheck extends IssuableSubscriptionVisitor {
 
  @Override
  public List<Kind> nodesToVisit() {
    return ImmutableList.of();
  }
 
}