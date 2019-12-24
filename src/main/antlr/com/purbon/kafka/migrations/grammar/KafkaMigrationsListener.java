// Generated from KafkaMigrations.g4 by ANTLR 4.7.2
package com.purbon.kafka.migrations.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KafkaMigrationsParser}.
 */
public interface KafkaMigrationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KafkaMigrationsParser#migration}.
	 * @param ctx the parse tree
	 */
	void enterMigration(KafkaMigrationsParser.MigrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KafkaMigrationsParser#migration}.
	 * @param ctx the parse tree
	 */
	void exitMigration(KafkaMigrationsParser.MigrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KafkaMigrationsParser#apply_function}.
	 * @param ctx the parse tree
	 */
	void enterApply_function(KafkaMigrationsParser.Apply_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KafkaMigrationsParser#apply_function}.
	 * @param ctx the parse tree
	 */
	void exitApply_function(KafkaMigrationsParser.Apply_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KafkaMigrationsParser#revert_function}.
	 * @param ctx the parse tree
	 */
	void enterRevert_function(KafkaMigrationsParser.Revert_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KafkaMigrationsParser#revert_function}.
	 * @param ctx the parse tree
	 */
	void exitRevert_function(KafkaMigrationsParser.Revert_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KafkaMigrationsParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(KafkaMigrationsParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KafkaMigrationsParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(KafkaMigrationsParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KafkaMigrationsParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(KafkaMigrationsParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link KafkaMigrationsParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(KafkaMigrationsParser.MethodContext ctx);
}