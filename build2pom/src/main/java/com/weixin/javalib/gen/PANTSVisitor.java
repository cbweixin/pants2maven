// Generated from /Users/xinwei/Documents/weixin/github/BUILD2pom/build2pom/src/main/java/com/weixin/grammar/PANTS.g4 by ANTLR 4.8
package com.weixin.javalib.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PANTSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PANTSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PANTSParser#pants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPants(PANTSParser.PantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(PANTSParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PANTSParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#java_lib_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_lib_stmt(PANTSParser.Java_lib_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#jvm_lib_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJvm_lib_stmt(PANTSParser.Jvm_lib_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#lib_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib_item_list(PANTSParser.Lib_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#lib_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib_item(PANTSParser.Lib_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#name_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_item(PANTSParser.Name_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#dependencies_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencies_item(PANTSParser.Dependencies_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#dependent_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_list(PANTSParser.Dependent_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#dependent_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_entry(PANTSParser.Dependent_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#sources_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSources_item(PANTSParser.Sources_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#strict_deps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrict_deps(PANTSParser.Strict_depsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PANTSParser#main_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_item(PANTSParser.Main_itemContext ctx);
}