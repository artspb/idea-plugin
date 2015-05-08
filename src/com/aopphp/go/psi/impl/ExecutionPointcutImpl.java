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

public class ExecutionPointcutImpl extends ASTWrapperPsiElement implements ExecutionPointcut {

  public ExecutionPointcutImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitExecutionPointcut(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FunctionExecutionReference getFunctionExecutionReference() {
    return findChildByClass(FunctionExecutionReference.class);
  }

  @Override
  @Nullable
  public MethodExecutionReference getMethodExecutionReference() {
    return findChildByClass(MethodExecutionReference.class);
  }

}
