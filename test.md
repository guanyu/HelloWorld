Welcome to Texts!
=================

This document shows styles that are available in Texts. Please feel free to edit
it. A fresh copy is always available via Help menu.

Inline Formatting
-----------------

To apply *emphasis* or **strong emphasis** simply press Ctrl+I or Ctrl+B.

Footnotes and Hyperlinks
------------------------

Notes can be placed anywhere[^1] in the source file. They will be moved to the
bottom of the corresponding page in paper-oriented formats (PDF, Word) and to
the end of the page in HTML. E-book readers usually display notes in popups.

[^1]: Yes, right here.

You can also add arbitrary hyperlinks. Link [text][2] can be different or be the
same as the URL, e.g. <http://www.google.com/>. In the first case the URL should
be put in a note like the one below, in the second case it’s included in the
main text.

[2]: <http://www.texts.io/>

Math
----

Formulas can be placed inline like $E=mc^2$ or in a separate paragraph, like the
following one. Standard TeX syntax is supported. Try exporting this file as PDF,
HTML or Word document.

$$
\frac{n!}{k!(n-k)!} = \binom{n}{k}
$$

Code
----

Inline `code` gets monospaced font.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Verbatim blocks use monospaced font as well and preserve line
breaks.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Press Shift+Enter to insert a line break.

Figures
-------

The best option is to use PNG or JPG. They are supported by all publishing
formats. Simply enter relative URL of your image file in a paragraph with
“Image” style.

![](<images/my-picture.png>)

Lists
-----

-   First bulleted item.

-   Second bulleted item.

    -   Subitem.

        -   Subsubitem.

            -   And some more.

1.  First numbered item.

2.  Second numbered item.

    1.  Subitem.

        1.  Subsubitem.

Enjoy your writing!
-------------------

Questions? Ask at <http://www.texts.io/support/>.
