package org.verapdf.model.impl.pb.operator.pathpaint;

import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.pdmodel.PDResources;
import org.verapdf.model.factory.operator.GraphicState;
import org.verapdf.model.operator.Op_f_fill;

import java.util.List;

/**
 * Operator which fills the path, using the nonzero winding
 * number rule to determine the region to fill
 *
 * @author Timur Kamalov
 */
public class PBOp_f_fill extends PBOpFillPaint implements Op_f_fill {

	/** Type name for {@code PBOp_f_fill} */
	public static final String OP_F_FILL_TYPE = "Op_f_fill";

	/**
	 * Default constructor
	 *
	 * @param arguments arguments for current operator, must be empty.
	 * @param state graphic state for current operator
	 * @param resources resources for tilling pattern if it`s used
	 */
	public PBOp_f_fill(List<COSBase> arguments,
			final GraphicState state, final PDResources resources) {
		super(arguments, state, resources, OP_F_FILL_TYPE);
	}

}
