package $package$

import zio.*

object Main extends ZIOAppDefault:

  override val run = ZIO.succeed(println("Hello $developer$"))
