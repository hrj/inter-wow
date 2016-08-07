fun svg(width: Int, height: Int, n:String):String {
  return """<svg xmlns:svg="http://www.w3.org/2000/svg"  xmlns="http://www.w3.org/2000/svg"  version="1.1" width="${width}" height="${height}" >
   ${n}
  </svg>"""
}

fun group(n:String):String {
  return """<g id="layer1">${n}</g>"""
}

fun rect():String {
  return """<rect width="100" height="100" x="10" y="10" style="fill:maroon;" />"""
}

println("""<?xml version='1.0' encoding='UTF-8' standalone='no'?>""")

println(
  svg(120, 120,
    group(
      rect()
    )
  )
)
