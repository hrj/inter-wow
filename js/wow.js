function svg(width, height, n) {
  return `<svg xmlns:svg="http://www.w3.org/2000/svg"  xmlns="http://www.w3.org/2000/svg"  version="1.1" width="${width}" height="${height}" >
   ${n}
  </svg>`
}

function group(n) {
  return `<g id="layer1">${n}</g>`
}

function rect() {
  return `<rect width="100" height="100" x="10" y="10" style="fill:maroon;" />`
}

console.log(`<?xml version='1.0' encoding='UTF-8' standalone='no'?>`)

console.log(
  svg(120, 120,
    group(
      rect()
    )
  )
)
