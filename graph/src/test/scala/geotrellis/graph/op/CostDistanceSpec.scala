package geotrellis.graph.op

import geotrellis.graph._
import geotrellis.spark._
import geotrellis.spark.testkit._
import geotrellis.raster._

import org.scalatest.FunSpec


class CostDistanceSpec extends FunSpec with TestEnvironment
    with RasterRDDMatchers
    with RasterRDDBuilders
    with OpAsserter {

  describe("Cost Distance Spec") {

    val n = NODATA

    // it("should perform as the non-distributed raster operation") {
    //   val tile = ArrayTile(Array(
    //     1, 3, 4,  4, 3, 2,
    //     4, 6, 2,  3, 7, 6,
    //     5, 8, 7,  5, 6, 6,

    //     1, 4, 5,  n, 5, 1,
    //     4, 7, 5,  n, 2, 6,
    //     1, 2, 2,  1, 3, 4
    //   ), 6, 6)

    //   val points = Seq(
    //     (1, 0),
    //     (2, 0),
    //     (2, 1),
    //     (0, 5)
    //   )

    //   val rasterOp = (tile: Tile, re: RasterExtent) => SingleCD(tile, points)

    //   val sparkOp = (rdd: RasterRDD[SpatialKey]) => rdd.toGraph.costDistance(points)

    //   testTile(sc, tile, 3, 3)(rasterOp, sparkOp)
    // }

  }
}
