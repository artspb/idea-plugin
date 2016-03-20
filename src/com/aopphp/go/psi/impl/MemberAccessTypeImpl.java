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
import com.jetbrains.php.lang.psi.elements.PhpModifier.State;

public class MemberAccessTypeImpl extends ASTWrapperPsiElement implements MemberAccessType {

  public MemberAccessTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) ((Visitor)visitor).visitMemberAccessType(this);
    else super.accept(visitor);
  }

  public State getMemberAccessType() {
    return PointcutQueryPsiUtil.getMemberAccessType(this);
  }

}
