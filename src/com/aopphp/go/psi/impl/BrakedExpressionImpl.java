// This is a generated file. Not intended for manual editing.
package com.aopphp.go.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aopphp.go.psi.PointcutTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aopphp.go.psi.*;
import com.aopphp.go.pointcut.Pointcut;

public class BrakedExpressionImpl extends ASTWrapperPsiElement implements BrakedExpression {

  public BrakedExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitBrakedExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PointcutExpression getPointcutExpression() {
    return findChildByClass(PointcutExpression.class);
  }

  @Override
  @Nullable
  public SinglePointcut getSinglePointcut() {
    return findChildByClass(SinglePointcut.class);
  }

  public Pointcut resolveBrakedExpression() {
    return PointcutQueryPsiUtil.resolveBrakedExpression(this);
  }

}
