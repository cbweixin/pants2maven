// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/PANTS.g4 by ANTLR 4.8
package com.weixin.javalib.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PANTSParser}.
 */
public interface PANTSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PANTSParser#pants}.
	 * @param ctx the parse tree
	 */
	void enterPants(PANTSParser.PantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#pants}.
	 * @param ctx the parse tree
	 */
	void exitPants(PANTSParser.PantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(PANTSParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(PANTSParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PANTSParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PANTSParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#java_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJava_lib_stmt(PANTSParser.Java_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#java_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJava_lib_stmt(PANTSParser.Java_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#scala_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterScala_lib_stmt(PANTSParser.Scala_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#scala_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitScala_lib_stmt(PANTSParser.Scala_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#jvm_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJvm_lib_stmt(PANTSParser.Jvm_lib_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#jvm_lib_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJvm_lib_stmt(PANTSParser.Jvm_lib_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#lib_item_list}.
	 * @param ctx the parse tree
	 */
	void enterLib_item_list(PANTSParser.Lib_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#lib_item_list}.
	 * @param ctx the parse tree
	 */
	void exitLib_item_list(PANTSParser.Lib_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#lib_item}.
	 * @param ctx the parse tree
	 */
	void enterLib_item(PANTSParser.Lib_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#lib_item}.
	 * @param ctx the parse tree
	 */
	void exitLib_item(PANTSParser.Lib_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#name_item}.
	 * @param ctx the parse tree
	 */
	void enterName_item(PANTSParser.Name_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#name_item}.
	 * @param ctx the parse tree
	 */
	void exitName_item(PANTSParser.Name_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#dependencies_item}.
	 * @param ctx the parse tree
	 */
	void enterDependencies_item(PANTSParser.Dependencies_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#dependencies_item}.
	 * @param ctx the parse tree
	 */
	void exitDependencies_item(PANTSParser.Dependencies_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#dependent_list}.
	 * @param ctx the parse tree
	 */
	void enterDependent_list(PANTSParser.Dependent_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#dependent_list}.
	 * @param ctx the parse tree
	 */
	void exitDependent_list(PANTSParser.Dependent_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#dependent_entry}.
	 * @param ctx the parse tree
	 */
	void enterDependent_entry(PANTSParser.Dependent_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#dependent_entry}.
	 * @param ctx the parse tree
	 */
	void exitDependent_entry(PANTSParser.Dependent_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#sources_item}.
	 * @param ctx the parse tree
	 */
	void enterSources_item(PANTSParser.Sources_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#sources_item}.
	 * @param ctx the parse tree
	 */
	void exitSources_item(PANTSParser.Sources_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#strict_deps}.
	 * @param ctx the parse tree
	 */
	void enterStrict_deps(PANTSParser.Strict_depsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#strict_deps}.
	 * @param ctx the parse tree
	 */
	void exitStrict_deps(PANTSParser.Strict_depsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(PANTSParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(PANTSParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PANTSParser#main_item}.
	 * @param ctx the parse tree
	 */
	void enterMain_item(PANTSParser.Main_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PANTSParser#main_item}.
	 * @param ctx the parse tree
	 */
	void exitMain_item(PANTSParser.Main_itemContext ctx);
}