import React from 'react'
import { LanguageProficiency } from '../models/LanguageProficiency'

type LanguageProficiencyViewProps = {
    languageProficiencies: Array<LanguageProficiency> | undefined
}

const LanguageProficiencyView = ({ languageProficiencies }: LanguageProficiencyViewProps) => {
    return (
        <section id="idiomas" className="secao-doc">
            <h2>Idiomas</h2>
            <table>
                <thead>
                    <tr>
                        <th>&nbsp;</th>
                        <th>Leitura</th>
                        <th>Escrita</th>
                        <th>Conversação</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        languageProficiencies?.map(languageProficiency => (
                            <tr key={languageProficiency.id}>
                                <th>{languageProficiency.language}</th>
                                <td>{languageProficiency.reading}</td>
                                <td>{languageProficiency.writing}</td>
                                <td>{languageProficiency.speaking}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </section>
    )
}

export default LanguageProficiencyView